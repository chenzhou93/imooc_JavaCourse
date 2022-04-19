var str = "123";
console.log(str+1);//string
console.log(str * 1 + 1);//integer -> auto cast
console.log(parseInt(str));
console.log(str+1);//integer

var str1 = "abc";
console.log(isNaN(str1));
if(!isNaN(str1)){
	console.log(parseInt(str1));
}else{
	console.log("error");
	str1 = 0;
}

