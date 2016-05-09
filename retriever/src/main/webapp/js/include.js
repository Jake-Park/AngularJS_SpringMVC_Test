//Adjust footer height
$(function(){		
  $('.row.well').css({ height: $(window).innerHeight() - 120 });
  $('.content.main').css({ height: $(window).innerHeight() - 212 });
  $(window).resize(function(){
    $('.row.well').css({ height: $(window).innerHeight() - 115});
  }); 
});/**
 * 
 */