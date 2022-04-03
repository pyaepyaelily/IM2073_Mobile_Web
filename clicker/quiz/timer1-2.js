/*
const startingMinutes = 2;
let time = startingMinutes * 60;

const countdownEl = document.getElementById('countdown');

//setInterval(updateCountdown, 200);

function updateCountdown(){
	const minutes = Math.floor(time / 60);
	let seconds = time % 60;

	countdownEl.innerHTML = `${minutes}: ${seconds}`;
	time--;

}
*/
let time = 30; //minutes * 60 seconds
let refreshIntervalId = setInterval(updateCountdown, 900); //update every 1 second

const countdownEl = document.getElementById('countdown'); 

function updateCountdown() {
    const minutes = Math.floor(time / 60); // rounds a number DOWN to the nearest integer
    let seconds = time % 60;

    seconds = seconds < 10 ? '0' + seconds : seconds; 
    countdownEl.innerHTML = `${minutes}:${seconds}`;

    time--;

    if (time < 0) { //stop the setInterval whe time = 0 for avoid negative time
        window.location.href = "mathqns2.html";
	}
}
