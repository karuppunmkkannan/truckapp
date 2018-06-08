/* Custom validation scripts  */

var baseUrl = "";

// glopal ajax call before send
$(document).ajaxSend(function(event, request, settings) {
	showSpinner();
});

// glopal ajax call get successhandler
$(document).ajaxSuccess(function(event, xhr, settings) {
	var response = JSON.parse(xhr.responseText);
	hideSpinner();
	if (response.status == "error") {
		alert("session expired please try again later");
	}
});

// glopal ajax call get errorhandler
$(document).ajaxError(function(event, jqxhr, settings, thrownError) {
	hideSpinner();
	console.log("Error appeared when get response" + settings.url);
});


var pleaseWaitDiv = $('	<div class="modal fade" id="pleaseWaitDialog" data-backdrop="false" data-keyboard="false" style="z-index: 1005"><div class="modal-dialog" style="margin-top: 20%; width: 5%;background-color: transparent;"><div class="modal-content" style="background: transparent;"><i class="fa fa-spinner fa-pulse fa-5x clrBase" style="background: transparent;"></i></div></div></div>');

function showSpinner() {
	pleaseWaitDiv.modal('show');
}

function hideSpinner() {
	pleaseWaitDiv.modal('hide');
}

function makeCookie(name, value) {
	var date = new Date();
	date.setTime(date.getTime() + (30 * 60 * 1000));
	$.cookie(name, value, {
		expires : date
	});
}

function getCookie(key) {
	return $.cookie(key);
}

function removeCookie(key) {
	return $.removeCookie(key);
}

function getCookieVal(key){
	if (typeof getCookie(key) != "undefined") {
	return  getCookie(key);
	}else {
		return "null";
	}
}




