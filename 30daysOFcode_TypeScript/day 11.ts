function main(): void {
    var arr: Array<any> = [];
    for (let arr_i: number = 0; arr_i < 6; arr_i++) {
      arr[arr_i] = readLine().split(' ');
      arr[arr_i] = arr[arr_i].map(Number);
    }
  
    var sumArray: Array<number> = [];
    for (let i: number = 0; i < arr.length; i++) {
  
      for (let j: number = 0; j < arr[i].length; j++) {
        let singleSum: number = 0;
        if (arr[i] && arr[i + 1] && arr[i + 2]) {
          if (arr[i][j + 1] != undefined && arr[i][j + 2] != undefined) {
            sumArray.push(arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2])
          }
        }
      }
    }
    console.log(Math.max.apply(null, sumArray));
  }
  