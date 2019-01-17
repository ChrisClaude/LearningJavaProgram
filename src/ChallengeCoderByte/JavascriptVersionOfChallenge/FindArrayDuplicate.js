let array = [9, 9, 111, 2, 3, 4, 4, 5, 7];

function findDuplicate(arr) {
    let duplicate;
    for (let i = 0; i < arr.length; i++) {
        for (let j = i + 1; j < arr.length; j++) {
            if (arr[i] === arr[j]) {
                duplicate = arr[i];
                console.log(duplicate);
            }
        }

    }
}

//console.log("test");
findDuplicate(array);