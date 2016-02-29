var openLayer = function (datetime) {	
    getData(datetime);  
}

var getData = function (datetime) {
	var res = angular.element($("[ng-controller='BookController']")).injector().get('Layer').getDataList(datetime);
	
	res.success(function(data) {
		console.log(data);
		writeLayer(data, datetime);
	});
	
	res.error(function(data) {
		console.log( "failure message: " + JSON.stringify({data: data}));
	});
};

var writeLayer = function(helpObj, datetime) {
    var contentLength = 0;
    

    var layerHtml = '<div id="floatdiv" class="container-fluid layer_width" style=" ' +
    'position:absolute;  ' +
    'height:auto; overflow-y: auto; ' +
    'padding:16px;background: #F1F1F1;  ' +
    'border: 4px solid #dbdbdb; border-radius: 4px; padding-top: 0;  ' +
    'z-index:999; display: none;">  ' +
    '';//<div style="background-color: #2c3c4d;">

    layerHtml += '<div class="row" style="background-color: #F1F1F1;">' +
	'<div class="col-sm-10" style="display:inline;"><h2>Available Teacher</h2></div>' + 
	'<div class="col-sm-2"><span style=\'cursor: pointer;margin-top:20px; border-\' class=\'pull-right\' onclick="javascript:hideHelp();">X</span></div>' +
	'</div>';
    
    for (var i = 0; i < helpObj.length; i++) {
        layerHtml += '<div class="row" style="border-top: 1px solid !important;"><div class="col-sm-4"><img src="' + helpObj[i].imageUrl + '" style="margin-top: 10px;"/><br>' + 
        	'<input type="button" class="btn btn-info pull-center" value="Book" style="margin:5px;" /></div>' +// ng-click="location.path(\'/addBook\')" 
        	'<div class="col-sm-8"><h3>';
        layerHtml += helpObj[i].name;
        //if (i == 0) {
            layerHtml += ''
        //}
        layerHtml += '        </h3><p class="center">';
        layerHtml += helpObj[i].aboutme;
        contentLength += (helpObj[i].aboutme).length;
        layerHtml += '        </p>' +
        '        </div>' +
        '    </div>';
    }

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
    //$('#floatdiv').css('width', (500 + addWidth));

    var layerWidth = parseFloat(($('#floatdiv').css('width')).replace('px', ''));
    console.log(layerWidth + ":");


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
	$('#layer').text("");
    $('#floatdiv').toggle(400);
};

