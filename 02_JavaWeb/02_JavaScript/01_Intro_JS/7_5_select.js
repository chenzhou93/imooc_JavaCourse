function ymd(){
	//get object
	var yyyy = document.getElementById("yyyy");
	var mm = document.getElementById("mm");
	var dd = document.getElementById("dd");

	var date = new Date();
	var year = parseInt(date.getFullYear());
	/*
	
	for(var i=1999; i<=year; i++){
		yyyy.options.add(new Option(i, i));
	}
	for(var i=1; i<=12; i++){
		mm.options.add(new Option(i, i));
	}
	for(var i=1; i<=31; i++){
		dd.options.add(new Option(i, i));
	}
	
	*/

	initSelect(yyyy, 1999, year);
	initSelect(mm, 1, 12);
	initSelect(dd, 1, 31);

	var n = yyyy.length;
	yyyy.selectedIndex = Math.round(n/2);

	//Delete day options
	dd.options.length = 0;
	
}

/*
	给列表框赋值，表单元素，开始值，结束值
*/
function initSelect(obj, start, end){
	for(var i=start; i<=end; i++){
		obj.options.add(new Option(i, i));
	}
}

function selectYmd(){
	var yyyy = document.getElementById("yyyy");
	var mm = document.getElementById("mm");
	var dd = document.getElementById("dd");

	var m = parseInt(mm.value);
	var dayEnd;

	if(m==4 || m==6 || m==9 || m==11){
		dayEnd = 30;
	}else if(m==2){
		dayEnd = 28;
		var y = parseInt(yyyy.value);
		if((y%4==0 && y%100!=0) || y%400==0){
			dayEnd = 29;
		}
	}else{
		dayEnd = 31;
	}

	dd.options.length = 0;

	initSelect(dd, 1, dayEnd);

}





