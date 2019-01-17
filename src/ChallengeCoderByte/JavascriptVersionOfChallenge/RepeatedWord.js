

function repeatedWord(sentence) {
    let arr = sentence.trim().split(" ");
    let result;
    let array;

    for (let i = 0; i < arr.length; i++) {
        for (let j = i + 1; j < arr.length; j++) {
            if(arr[i] === arr[j])
                result = arr[i];
        }
    }

    return result;
}

console.log(repeatedWord("Je suis suis la")); // french sentence meaning: I am am here