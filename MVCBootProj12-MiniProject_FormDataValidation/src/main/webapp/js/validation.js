function doValidate(frm){
	
	//empty span tag msg
	document.getElementById("enameErr").innerHTML="";
	document.getElementById("eaddrErr").innerHTML="";
	document.getElementById("jobErr").innerHTML="";
	document.getElementById("salErr").innerHTML="";
	
	//get element data 
	let name=frm.ename.value;
	let addr=frm.eaddr.value;
	let job=frm.job.value;
	let sal=frm.sal.value;
	let noError=true;
	
	
	//for name property 
	if(name==""){
		document.getElementById("enameErr").innerHTML="Employee name is mandatory";
		noError=false;
		
	}else if(name.length<5 || name.length>10){
		document.getElementById("enameErr").innerHTML="Employee name must be between 5 to 10 character";
		noError=false;
		
	}
	//for address property 
	if(addr==""){
		document.getElementById("eaddrErr").innerHTML="Employee address is mandatory";
		noError=false;
		
	}else if(addr.length<5 || addr.length>15){
		document.getElementById("eaddrErr").innerHTML="Employee address must be between 5 to 15 character";
		noError=false;
		
	}
	//for job property 
	if(job==""){
		document.getElementById("jobErr").innerHTML="Employee job is mandatory";
		noError=false;
		
	}
	//for sal property 
	if(sal==""){
		document.getElementById("salErr").innerHTML="Employee salary is mandatory";
		noError=false;
		
	}else if(isNaN(sal)){
		document.getElementById("salErr").innerHTML="Employee salary must be numeric";
		noError=false;
		
	}else if(sal<10000 || sal>200000){
		document.getElementById("salErr").innerHTML="Employee salary must be in Range of 10000 to 200000";
		noError=false;
		

	}
	
		document.getElementById("verified").innerHTML=true;

	return noError;
	
	
}