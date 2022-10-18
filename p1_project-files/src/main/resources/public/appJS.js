async function userLogin() {
    
    uName = document.getElementById('userName').value;
    uPass = document.getElementById('userPass').value;

    let credentials = {
        userName: uName,
        userPass: uPass
    }

    credentialsJSON = JSON.stringify(credentials);

    let baseURL = "http://localhost:8080";

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

function loadPageForUserWithSessionStorage() {

    let name = sessionStorage.getItem("userName");
    let role = sessionStorage.getItem("userRoleID");
    let staffID = sessonStorage.getItem("staffID");

    document.getElementById("homeHeader").innerHTML = `Welcome Back, ${name}.`;

    if (role == 2){
        //userRoleID == employee
    } else {
        //userRoleID == manager
    }
}

async function userIsEmployee(){
    //functionality goes here
}