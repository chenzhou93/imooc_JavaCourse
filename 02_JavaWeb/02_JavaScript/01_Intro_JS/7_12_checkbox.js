var flag = true; //全局变量只有在刷新的时候初始化

function checkInterest(){
	var interest = document.getElementsByName("interest");
	for(var i=0; i<interest.length; i++){
		//interest[i].checked = true;
		interest[i].checked = flag;
	}
	
	if(flag){
		document.getElementById("btn1").value = "Deselect All";
	}else{
		document.getElementById("btn1").value = "Select All";
	}
	flag = !flag; //switch
}

function checkInterest1(){
	var interest =  document.getElementsByName("interest");
	for(var i=0; i<interest.length; i++){
		interest[i].checked = false;
	}
}