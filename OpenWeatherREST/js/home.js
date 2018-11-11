$(document).ready(function(){

       
    $('#submit-zip-code').click(function(){
        var zip = $('#zipCodeBox').val();
        var units = $('#unitType').val();
        clearForm();
        submitZipcode(zip, units);
    });


    $('#zipCodeBox').keydown(function(event){
        var zip = $('#zipCodeBox').val();
        var units = $('#unitType').val();
        clearForm();
        if(event.keyCode === 13) {
            event.preventDefault();
            submitZipcode(zip, units);
        }
    })


});

function submitZipcode (zip, units){


    if(validateZipCode(zip)){
        getWeatherForToday(zip, units);
        getWeekForecast(zip, units);
    } else {
        $('#errorMessages').append($('<li>').attr({class:'list-group-item list-group-item-danger'}).text('Please enter a valid 5 digit zipcode.'));
    }

}

function getWeatherForToday(zip, units){
    var apiKey ='a935790e8cfea30abff498bfeb99202d';
    $.ajax({
        type: 'GET',
        url: 'https:api.openweathermap.org/data/2.5/weather?zip=' + zip +'&APPID='+apiKey,
        data:{
            units: units,
            apiKey: apiKey,
        },
        success: function(forecastArray){
            var todayWeatherIcon = '';

            $('#currentConditions').show();

            //Forecast for Today
            $('#cityName').append('Current Conditions for ' + forecastArray.name)
            $('#icon').append($('<img>').attr({src:'https://openweathermap.org/img/w/'+forecastArray.weather[0].icon + '.png'})).append(forecastArray.weather[0].main + ': '+forecastArray.weather[0].description);

            //Select metric or imperial for display
            if(units === 'metric'){
                $('#city-temperature').append('<b>Temperature: </b>' + forecastArray.main.temp + ' C<br>');
                $('#city-temperature').append('<b>Humidity: </b>' + forecastArray.main.humidity + '%<br>');
                $('#city-temperature').append('<b>Wind: </b>' + forecastArray.wind.speed + 'km/h');
            } else {
                $('#city-temperature').append('<b>Temperature: </b>' + forecastArray.main.temp + ' F<br>');
                $('#city-temperature').append('<b>Humidity: </b>' + forecastArray.main.humidity + '%<br>');
                $('#city-temperature').append('<b>Wind: </b>' + forecastArray.wind.speed + 'mp/h');
            }
        }
    })
}

function getWeekForecast(zip, units){
    var apiKey = 'a935790e8cfea30abff498bfeb99202d'
    $.ajax({
        type: 'GET',
        url: 'https:api.openweathermap.org/data/2.5/forecast?zip=' + zip +'&APPID='+apiKey,
        data:{
            units: units,
            apiKey: apiKey,
        },
        success: function(forecastArray){
            var date = /\d\d\d\d-\d\d-\d\d/;
            var monthNames = ['January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December'];

            for (i = 0; i <= 5; i++) {
                $('#day'+i).empty();
            }

            $('#fiveDayForecast').show();

            var i;
            var dayNum = 1;
            for (i = 0; i <= 32; i+=8) {
                var dates = new Date(date.exec(forecastArray.list[i].dt_txt));
                var monthName = monthNames[dates.getMonth()];
                var day = dates.getDate();
                console.log( monthName + ' ' + day);
                $('#day'+dayNum).append(day+1 + ' ' + monthName +'<br>')
                $('#day'+dayNum).append($('<img>').attr({src:'https://openweathermap.org/img/w/'+forecastArray.list[i].weather[0].icon + '.png'}));
                $('#day'+dayNum).append(forecastArray.list[i].weather[0].main+ '<br>');
                if(units === 'metric'){
                    $('#day'+dayNum).append('High: ' + forecastArray.list[i].main.temp_max + ' C '
                        + 'Low: ' + forecastArray.list[i].main.temp_min + ' C ');
                } else {
                    $('#day'+dayNum).append('High: ' + forecastArray.list[i].main.temp_max + ' F '
                    + 'Low: ' + forecastArray.list[i].main.temp_min + ' F ');
                }
                dayNum += 1;
            }

            dayNum = 1;
        }
    })
}


function clearForm() {
    $('#errorMessages').empty();
    $('#zipCodeBox').empty();
    $('#cityName').empty();
    $('#city-temperature').empty();
    $('#icon').empty();
    $('#dayOne').empty();
    $('#dayTwo').empty();
    $('#dayThree').empty();
    $('#dayFour').empty();
    $('#dayFive').empty();
}

function validateZipCode(zip) {
    if(zip.length < 5 || zip.length >5 || zip === "" || zip === null) {
        clearForm();
        return false;
    } else {
        return true;
    }
}
