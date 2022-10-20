let baseURL = "http://localhost:8080";

async function userLogin() {
    
    uName = document.getElementById('userName').value;
    uPass = document.getElementById('userPass').value;

    let credentials = {
        userName: uName,
        userPass: uPass
    }

    credentialsJSON = JSON.stringify(credentials);

        let res = await fetch(

        `${baseURL}/authenticate`,

        {
            method: 'POST',
            header: {'Content-Type': 'application/json'},
            body: credentialsJSON
        }
    );

    if (res.status===200){

        let loggedInUser = await res.json();
        
        sessionStorage.setItem('userName', loggedInUser.userFName);
        sessionStorage.setItem('userRoleID', loggedInUser.userRoleID);

        document.location.assign("./home.html");

    }
}

let name = sessionStorage.getItem("userName");
let role = sessionStorage.getItem("userRoleID");
let staffID = sessonStorage.getItem("staffID");

async function allByStaffID(){
    //load all requests by staffID functionality
        
    //make a call to the backend
    
        //define reference variable

    let allByStaffID = document.getElementById('staffID').value;
    
        //send GET request using fetchAPI with async/await

    let resAllByStaffID = await fetch(`${baseURL}/all-requests/${allByStaffID}`);

    if (resAllByStaffID.status === 200){
        
        let resAllByStaffIDArray = await resAllByStaffID.json(); //returns Array

        //select existing table from DOM
        let requestsTableBody = document.getElementById('homeTableHeader');
    
        //create a new tr
                
        //create a td for each property we want displayed in the table       
                      
        //add the newly created tds to the newly created tr using while-loop
        
        //add the tr to the existing table from DOM
    
    }
}

async function allRequests(){
    //load all requests
    //select existing table from DOM
    //create a new tr
    //create a td for each property we want displayed in the table
    //add the newly created tds to the newly created tr
    //add the tr to the existing table from DOM
}

function loadPageForUserWithSessionStorage() {

    document.getElementById("homeHeader").innerHTML = `Welcome Back, ${name}.`;

    if (role == 2){

        allByStaffID();
        
    } else if (role == 1){

        allRequests();

    }
}