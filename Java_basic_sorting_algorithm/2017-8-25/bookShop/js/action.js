$(function(){
	$("#toShopping").click(function() {
		var username = $("#username").val();
		var password = $("#password").val();
		var flag=0;
		for (var i = 0; i < users.length; i++) {
			if (username==users[i].username&&password==users[i].password) {
				window.location.href="showBooks.html";
				flag=1;
			}
		}
		if (flag==0) {
			alert("账号或密码错误，默认账号及密码为：lcb");
			location.href="login.html";
		}
	});
});