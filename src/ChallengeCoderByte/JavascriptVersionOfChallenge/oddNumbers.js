/**
 * oddNumbers.js
 * oddNumbers function prints the odd all the odd numbers
 * between the two numbers passed to it as parameters
 * @param l first parameter include in the check for odd numbers
 * @param r second parameter not included in the check for odd numbers
 * @returns {array[]}
 */
function oddNumbers(l, r) {
    let arr = new Array(r - l);
    let num = 0;

    for (let i = l; i < r; i++) {
            arr[num++] = i;
    }

    return arr.filter((index)=> {
        return index % 2 != 0;
    });
}

console.log(oddNumbers(1, 9));