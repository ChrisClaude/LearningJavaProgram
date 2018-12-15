/*

Have the function LetterCapitalize(str) take the str parameter
being passed and capitalize the first letter of each word.
Words will be separated by only one space.

*/

function LetterCapitalize(str) {

    wordarr = str.split(" ");

    for (var i = 0, n = wordarr.length; i < n; i++) {
        wordarr[i] = wordarr[i][0].toUpperCase() + wordarr[i].slice(1);
    }
    str = wordarr.join(" ");

    return str;

}

// keep this function call here
// to see how to enter arguments in JavaScript scroll down
LetterCapitalize(readline());

/*
What I did
======================

function LetterCapitalize(str) {
    let newStr = "";
    str.trim();
    let index = 0;
    for(let i = 0; i < str.length; i++){

        if(i === 0) {
            newStr += str.charAt(i).toUpperCase();
        } else if(str.charAt(i).includes(" ")){
            newStr += str.charAt(i) + str.charAt(i + 1).toUpperCase();
            i += 1;
        }else {
        newStr += str.charAt(i);
        }

    }
    return newStr;

}

// keep this function call here
LetterCapitalize(readline());
 */