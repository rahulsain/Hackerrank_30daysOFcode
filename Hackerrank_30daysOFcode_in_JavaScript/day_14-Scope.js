class Difference{
    constructor(a){
        this.element = a;
        this.maximumDifference = 0;
    }

    computeDifference = () => {
        var max = 0, min = 101;

        for(var i=0; i<this.element.length; i++){
            if(max < this.element[i])
                max = this.element[i];
            if(min > this.element[i])
                min = this.element[i];
        }

        this.maximumDifference = max - min;
    }
}

var n = parseInt(readLine());
var a = readLine().split(' ');
a = a.map(Number);

d = new Difference(a);
d.computeDifference();

console.log(d.maximumDifference);