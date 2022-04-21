var n = 9;

function fun1(){
	var n1 = 5;
	n = 12;
}

function fun2(){
	n = n - 1;
}

function fun3(){
	console.log(n);
	console.log(n1);
}

fun1();
fun2();
fun3();