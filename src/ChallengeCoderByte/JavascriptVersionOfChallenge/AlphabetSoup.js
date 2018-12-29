function AlphabetSoup(str) {
    str = str.toLowerCase();
    let arr = str.split("");
    let sortArr = arr.sort();
    let newStr = sortArr.join("");

    return newStr;
}

console.log(AlphabetSoup('Hello'));
