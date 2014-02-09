Create a simple calculator with a method that takes a string.
The method can take 0, 1 or 2 numbers, and will return their sum (for an empty string it will return 0) for example "" or "1" or "1,2".
Start with the simplest test case of an empty string and move to 1 and two numbers.
Commit with the comment Step 1 and push.
Allow the method to handle an unknown amount of numbers. Commit with the comment Step 2 and push.
Allow the method to handle new lines between numbers (instead of commas).
The following input is ok: 1\n2,3 (will equal 6).
The following input is NOT ok: 1,\n.
Make sure you validate the input is formatted correctly.
Commit with the comment Step 3 and push.
Allow the method to handle a different delimiter.
To change a delimiter, the beginning of the string will contain a separate line that looks like this: //[delimiter]\n[numbers…] for example //;\n1;2 should return three where the default delimiter is ;.
The first line is optional. All existing scenarios should still be supported.
Commit with the comment Step 4 and push.
Calling the method with a negative number will throw an exception.
The exception message is “negatives not allowed” and will include the negative that was passed.
If there are multiple negatives, show all of them in the exception message.
Commit with the comment Step 5 and push.
