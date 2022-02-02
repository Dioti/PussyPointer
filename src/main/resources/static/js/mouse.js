var timer;
window.addEventListener("mousemove",function(e){
    clearTimeout(timer);
    console.log(e.clientX + ", " + e.clientY);
    timer=setTimeout(function () {
        console.log("MOUSE STOPPED");
    },3000);
});