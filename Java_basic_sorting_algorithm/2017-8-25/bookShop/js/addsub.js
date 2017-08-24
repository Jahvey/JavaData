 function add() {
 	var txt = document.getElementById("txt");
 	var a = txt.value;
 	a++;
 	txt.value = a;
 }

 function sub() {
 	var txt = document.getElementById("txt");
 	var a = txt.value;
 	if(a > 1) {
 		a--;
 		txt.value = a;
 	} else {
 		txt.value = 1;
 	}

 }