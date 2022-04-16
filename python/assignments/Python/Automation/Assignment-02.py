"""Regex Version of strip()
Write a function that takes a string and does the same thing as the strip() string method. If no other arguments are passed other than the string to strip, then whitespace characters will be removed from the beginning and end of the string. Otherwise, the characters specified in the second argument to the function will be removed from the string."""

#program

def stripp(text, leftright = None):
    import re
    if leftright == None:
        stripRegex = re.compile(r'^\s*|\s*$')
        text = stripRegex.sub('', text)
        print(text)
    else:
        stripRegex = re.compile(r'^.|.$')
        margins = stripRegex.findall(text)
        while margins[0] in leftright:
            text = text[1:]
            margins = stripRegex.findall(text)
        while margins[-1] in leftright:
            text = text[:-2]
            margins = stripRegex.findall(text)
        print(text) 

k = '    $$$$$$$     '
li = '@&&@#$gnchuhjnhjkll&&^&&&&%%'
n = '@&#$^%+'

stripp(k)
stripp(li, n)