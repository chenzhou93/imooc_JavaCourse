var str = "123";
console.log(parseInt(str));
console.log(parseFloat(str));
console.log(Number(str));

var str1 = "abc";
console.log(parseInt(str1));
console.log(parseFloat(str1));
console.log(Number(str1));


// var str1 = "0.123.654";
// var str1 = null; NaN, NaN, 0
// var str1 = ""; NaN, NaN, 0

var str2 = "";
console.log(Boolean(str2)); //false
var str3 = null;
console.log(Boolean(str3)); //false
var str4 = "asdf";
console.log(Boolean(str4)); //true