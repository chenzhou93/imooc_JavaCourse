var n = 10;
var str;

if(n > 10){
	str = "n > 10";
}else if(n < 10) {
	str = "n < 10";
}else{
	str = "n = 10";
}

console.log(str);

var myScore = 95;
var str;
var n = parseInt(myScore/10);

switch(n){
	case 10:
		str = "perfect";
		break;
	case 9:
		str = "excellent";
		break;
	case 8:
	case 7:
		str = "perfect";
		break;
	default:
		str = "fail";
		break;
}

var i;
var sum = 0;
for(i=0; i<=100; i++){
	sum = sum+i;
}
console.log(sum);