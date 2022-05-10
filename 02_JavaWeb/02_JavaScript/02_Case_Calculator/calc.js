function init(){//Recommended
	var num = document.getElementById("num");
	num.value = 0;
	num.disabled = "disabled";
	
	/*
	var n1 = document.getElementById("n1");
	n1.onclick = function(){
		alert("n1");
	};
	*/

	var oButton = document.getElementsByTagName("input");
	var btn_num1;
	var fh;
	for(var i=0; i<oButton.length; i++){
		oButton[i].onclick = function(){ 
			if(isNumber(this.value)){
				//num.value = (num.value + this.value) * 1;
				if(isNull(num.value)){
					num.value = this.value;
				}else{
					num.value = num.value + this.value;
				}
			}else{
				var btn_num = this.value;
				switch(btn_num){
					case "+":
						btn_num1 = parseInt(num.value);
						num.value = 0;
						fh = "+";
						break;

					case "-":
						btn_num1 = parseInt(num.value);
						num.value = 0;
						fh = "-";
						break;
					
					case "*":
						btn_num1 = parseInt(num.value);
						num.value = 0;
						fh = "*";
						break;

					case "/":
						btn_num1 = parseInt(num.value);
						num.value = 0;
						fh = "/"; 
						break;

					case ".":
						num.value = dec_number(num.value);
						break;

					case "<-":
						num.value = back(num.value);
						break;

					case "C":
					break;

					case "+/-":
					break;

					case "=":
						switch(fh){
							case "+":
								num.value = btn_num1 + Number(num.value);
								break;
							case "-":
								num.value = btn_num1 - Number(num.value);
								break;
							case "*":
								num.value = btn_num1 * Number(num.value);
								break;
							case "/":
								if(num.value == 0){
									num.value = 0;
								}else{
									num.value = btn_num1 / Number(num.value);
								}
								break;
						}
					break;
				}
			}
		}
	}
}

//Null Check
function isNull(n){
	if(n == "0" || n.length==0){
		return true;
	}
}

function isNumber(n){
	return !isNaN(n);
}

//Dec
function dec_number(n){
	if(n.indexOf(".") == -1){
		n = n + ".";
	}
	return n;
}

//Back
function back(n){
	n = substr(0, n.length -1);
	if(!isNull(n)){
		n = 0;
	}
	return n;
}

/*
function num_1_click(){
	var num = document.getElementById("num");
	var n = num.value;
	// if(n==="0"){
	// 	n = "";
	// }
	n = n + "1";
	document.getElementById("num").value = n * 1;
}
function num_2_click(){
	var num = document.getElementById("num");
	var n = num.value;
	n = n + "2";
	document.getElementById("num").value = n * 1;
}
function num_3_click(){
	var num = document.getElementById("num");
	var n = num.value;
	n = n + "3";
	document.getElementById("num").value = n * 1;
}
*/