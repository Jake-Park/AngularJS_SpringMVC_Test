var openLayer = function (datetime) {
    getData(datetime);    
   
}

var getData = function (datetime) {
	var res = angular.element($("[ng-controller='BookController']")).injector().get('Layer').getDataList(datetime);
	
	res.success(function(data) {
		writeLayer(data[0], datetime);
	});
	
	res.error(function(data) {
		console.log( "failure message: " + JSON.stringify({data: data}));
	});
};

var writeLayer = function(helpObj, datetime) {
    var contentLength = 0;

    var layerHtml = '<div id="floatdiv" class="container-fluid" style=" ' +
    'position:absolute;  ' +
    'width:400px; height:auto; overflow-y: auto; ' +
    'padding:16px;background: #F1F1F1;  ' +
    'border: 4px solid #dbdbdb; border-radius: 4px; padding-top: 0;  ' +
    'z-index:999; display: none;">  ' +
    '';//<div style="background-color: #2c3c4d;">

    //helpObj.help[0].content += "The PACF gives the partial correlation of a time series with its own lagged values, controlling for the values of the time series at all shorter lags. It contrasts with the autocorrelation function, which does not control for other lags.";

    //for (var i = 0; i < indexArr.length; i++) {
        layerHtml += '<div class="row" style="border-bottom: 1px solid !important;background-color: #F1F1F1;">' +
        	'<div class="col-sm-10" style="display:inline;"><h2>Available Teacher</h2></div>' + 
        	'<div class="col-sm-2"><span style=\'cursor: pointer;margin-top:20px; border-\' class=\'pull-right\' onclick="javascript:hideHelp();">X</span></div>' +
        '</div>' +
        '<div class="row"><div class="col-sm-4"><img src="' + helpObj.imageUrl + '" style="margin-top: 10px;"/><br/><br>' + 
        	'<input type="button" class="btn btn-info pull-center" value="Book" ng-click="location.path(\'/addBook\')" /></div>' + 
        	'<div class="col-sm-8"><h3>';
        layerHtml += helpObj.name;
        //if (i == 0) {
            layerHtml += ''
        //}
        layerHtml += '        </h3><p class="center">';
        layerHtml += helpObj.aboutme;
        contentLength += (helpObj.aboutme).length;
        layerHtml += '        </p>' +
        '        </div>' +
        '    </div>';
    //}

    layerHtml += '</div>' +
    '';//</div> 

    $('#layer').append(layerHtml);
    var addWidth = 0;

    if (contentLength > 500) {
        // If content length is higher than 500, width will be increased 100 px by 500 character
        // but if maximum width is 1000 px
        odd = parseInt(contentLength / 500);

        if (odd > 4) {
            addWidth = 500;
        }
        else {
            addWidth = odd * 100;
        }
    }

    var thisObj = $("a[href*='" + datetime + "']");
    $('#floatdiv').css('width', (500 + addWidth));

    var layerWidth = parseFloat(($('#floatdiv').css('width')).replace('px', ''));
    //console.log(thisObj.offset().top + ":" + thisObj.offset().left);


/*    if (cate == "login") {
        $('#floatdiv' + index).css('top', 1);
        $('#floatdiv' + index).css('left', (screen.width / 2) - ($(".login-wrapper").css("width")).replace("px", ""));
    }
    else {*/
        $('#floatdiv').css('top', thisObj.offset().top);
        $('#floatdiv').css('left', thisObj.offset().left - (layerWidth + 30));
    //}		
    $('#floatdiv').toggle('400');
};

var hideHelp = function () {
    $('#floatdiv').toggle(400);
};

