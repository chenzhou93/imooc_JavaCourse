var str = "5201314199906061234";
console.log(str.substr(0, 3)); //start, length
console.log(str.substr(6, 4)); //start, length
console.log(str.substring(0, 3)); //[start, end)

console.log(str.charAt(16));
var n = parseInt(str.charAt(3));

console.log(str.length);

console.log(str.indexOf(1)); //从编号为第一的位置开始，找1第一次出现的位置
console.log(str.indexOf("1", 4)); //从编号为第四的位置开始，找1第一次出现的位置

var str1="aa,ttt,121,gg,kk,aa,bb";
var arr = str1.split(",");
console.log(arr);
console.log(arr[0]);

console.log(str.concat("55", "77")); //5577
console.log(arr.concat("55", "77", "00")); //55, 77, "00"
console.log(str.replace("aa", "imooc")); //只替换一个

var d1 = new Date();
var d2 = new Date("2020-1-1 10:56:56");
console.log(d2.getDate());
console.log(d2.getMonth() + 1); //Month starts at 0
console.log(d2.getFullYear());
console.log(d2.getHours());

var n = d2.getTime() - d1.getTime();
console.log(n/(24*3600*1000));

//2020-1-1 15:59 Date Format
function funFmtDate(){
	var d1 = new Date();
	var yyyy, mm, dd, hh, mi, ss;
	var time;
	yyyy = d1.getFullYear();
	mm = d1.getMonth() + 1;
	dd = d1.getDate();
	hh = d1.getHours();
	si = d1.getMinutes();
	ss = d1.getSeconds();
	time = yyyy + "-" + mm + "-" + dd + " " + hh + ":" + mi + ":" + ss;
	return time; 
}
console.log(funFmtDate());

var n = 16.654789;
console.log(Math.round(n)); //只能取整数
console.log(Math.round(n.toFixed(2))); 
console.log(Math.min(2,6,81,1));
console.log(Math.max(2,6,81,1));
