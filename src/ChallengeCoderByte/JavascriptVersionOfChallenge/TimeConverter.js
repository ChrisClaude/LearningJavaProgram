/*
Have the function TimeConvert(num) take the num parameter being passed and
return the number of hours and minutes the parameter converts to
(ie. if num = 63 then the output should be 1:3).
Separate the number of hours and minutes with a colon.

Use the Parameter Testing feature in the box below to test your code with
different arguments.
 */

/*
    My Solution was
    ===================

    let time_1;
    let time_2;

    if(num >= 60) {
        time_1 = (num / 60).toFixed();
        time_2 = (((num / 60) -(num / 60).toFixed()) * 60).toFixed();
    } else {
        time_1 = 0;
        time_2 = num;
    }

    let myTime = `${time_1}:${time_2}`;

    return myTime;
 */

function TimeConvert(num) {
    let hours = Math.floor(num/60);
    let minutes = num % 60;
    let str = `${hours}:${minutes}`;

    return str;
}

TimeConvert(45); // expected output 0:45
TimeConvert(126); // expected output 2:6
