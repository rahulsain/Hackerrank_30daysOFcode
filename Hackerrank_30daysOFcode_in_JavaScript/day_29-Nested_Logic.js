function processData(input) {
    //Enter your code here
    let dates = input.split("\n");
    let a = dates[0].split(" ").map(Number);
    let b = dates[1].split(" ").map(Number);
    let actDate = new Date( a[2] , a[1] , a[0] );
    let expDate = new Date( b[2] , b[1] , b[0] );
    let fine = 0
    
    if ( actDate <= expDate )
        fine = 0;
    else if ( a[1] == b[1]  &&  a[2] == b[2] )
        fine = 15*(a[0] - b[0]);
    else if (a[2] == b[2])
        fine = 500*(a[1] - b[1]);
    else
        fine = 10000;
    
    console.log(fine);
} 