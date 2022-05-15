## Lab Report 2 Markdown Parser

1. test-file.md:  The error I was getting was an outofbounds error. This was due to the way i was initilizing the variables if one did not exist in the string.
2. test-file2.md: Again I got an array out of bounds error, which was caused by an infinite loop, where it got stuck looking for the parathases in the last line of text.
3. test-file3.md: gave me the correct output of an empty list. 
4. test-file4.md: gave me the correct output of an empty list. 
5. test-file5.md: gave me the wrong output a list with 'page.com' written in it, though the desired output is an empty list.
6. test-file6.md: gave me the desired output of an empty list.
7. test-file7.md: gave me the desired output of an empty list.
8. test-file8.md: gave me the desired output of an empty list.

Both test files one and two gave me the same output of an error. This was due to extra lines of text and empty lines being after a link. All the other tests had the same correct behavior except for test 5. This was beacuse there was still the brackets before the link and my function did not check if they were next to eachother. The only two files with the same symptoms were test-file.md and test-file2.md. Which was because when I wrote my first version for lab3, if the indexOf function returned -1 I would manually set the index.
