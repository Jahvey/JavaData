function select(obj) {
	if(obj.checked == "true") {
		document.getElementById('inputtext').value = obj.value; //假设你的文本框的id="inputtext"  
	} else if(obj.checked == "false") {
		document.getElementById('inputtext').value = "";
	}
}