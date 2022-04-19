/*
	2-1 Function
*/

//function add()

function add(n1, n2){
	alert(n1 + n2);
}


function add(n1, n2){
	var n3;
	n3 = n1 + n2;
	return n3;
}
var num = add(3,4);
alert(num);



var num1 = function(n1, n2){
	var n3 = n1 + n2;
}
alert(num1(13, 14)); //undefined


var num1 = function(n1, n2){
	var n3 = n1 + n2;
	return n3;
}
alert(num1(13,14));

alert(num2(3, 6)); //先使用再定义（不建议）
function num2(n1, n2){
	return n1 + n2;
}

