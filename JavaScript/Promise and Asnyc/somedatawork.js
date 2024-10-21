function getData(getmydata, getnextdata){
    setTimeout(() => {
        console.log("My Data", getmydata);
        if(getnextdata){
            getnextdata();
        }
    }, 3000);
}

getData("This is my Data",()=>{
    getData("This is my Next Data",() => {
        getData("This is my Next Next Data");
    });
});