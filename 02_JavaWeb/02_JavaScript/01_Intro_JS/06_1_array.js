var arrObj = new Array();
var arrObj1 = new Array(5);
var arrayObj2 = new Array(2, 4, "a", "y", 8);
var arrayObj3 = [2, 4, "a", "y", 8];
console.log(arrayObj3[0]);

//Loop
for(var i in arrayObj3){
	console.log(i);//index
	console.log(arrayObj3[i]);//value
}

var i = 0;
var n = arrayObj3.length;
for(i; i<n; i++){
	console.log(arrayObj3[i]);
}
