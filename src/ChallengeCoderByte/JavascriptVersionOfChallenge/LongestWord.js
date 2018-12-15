/*
Best Solution
==========================

sen = sen.trim();
  sen = sen.replace(/[^a-zA-Zsd]/g, '');

  var arr = sen.split(' ');

  arr.sort(function(a, b) {return b.length - a.length});

  return arr.shift();
==================================================================

Best Solution 2
==========================
  let validCharacters = 'abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789';

    let maxLength = 0;
    let longestWord = '';

    for (let i = 0, length = 0, word = ''; i < sen.length; i++) {
        let c = sen[i];
        if (validCharacters.includes(c)) {
            length++;
            word += c;
        } else {
            length = 0;
            word = '';
        }

        if (length > maxLength) {
            maxLength = length;
            longestWord = word;

        }
    }

  return longestWord;

 */

function LongestWord(sen) {

    var str = sen.toLowerCase().split("");
    var word = '';
    var longestWord = '';

    for (let i = 0; i < str.length; i++) {
        if (str[i] >= 'a' && str[i] <= 'z') {
            word += str[i];
        } else {
            word += ' ';
        }
    }

    var arr = word.split(" ");

    arr.forEach(function (el) {
        if (el.length > longestWord.length) {
            longestWord = el;
        }
    });

    return longestWord;
}

console.log(LongestWord('Hello@#4h79world'));


