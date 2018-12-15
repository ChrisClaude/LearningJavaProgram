/*

Have the function SimpleSymbols(str) take the str parameter being passed
and determine if it is an acceptable sequence by either returning the string true or false.
The str parameter will be composed of + and = symbols with several letters between them (ie. ++d+===+c++==a)
and for the string to be true each letter must be surrounded by a + symbol. So the string to
the left would be false. The string will not be empty and will have at least one letter.

 */


function SimpleSymbols(str) {

    if (/^[a-zA-Z]/.test(str) || /[a-zA-Z]$/.test(str)) {
        return false;
    }
    else if (/[^+][a-zA-Z]/.test(str) || /[a-zA-Z][^+]/.test(str)) {
        return false;
    }
    else {
        return true;
    }

}


/*
My codes
=================================

function SimpleSymbols(str) {
    str = str.toLowerCase();
    var chr = str.split("+");
    var check = false;

    for (let i = 0; i < chr.length; i++) {
        if (chr[i] >= "a" && chr[i] < "z") {
            if (chr[i] == str.charAt(i)) {
                if(str.charAt(i+1) == "+" && str.charAt(i-1) === "+") {
                    check = true;
                }
            }
        }
    }
    return check.toString();

}

// keep this function call here
SimpleSymbols(readline());
 */