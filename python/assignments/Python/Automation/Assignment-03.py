"""Create a Mad Libs program that reads in text files and lets the user add their own text anywhere the word ADJECTIVE, NOUN, ADVERB, or VERB appears in the text file. 

For example, a text file may look like this:

	The ADJECTIVE panda walked to the NOUN and then VERB. A nearby NOUN was unaffected by these events.



The program would find these occurrences and prompt the user to replace them.

Enter an adjective:
silly
Enter a noun:
chandelier
Enter a verb:
screamed
Enter a noun:
pickup truck"""



"""The following text file would then be created:

	The silly panda walked to the chandelier and then screamed. A nearby pickup truck was unaffected by these events.



The results should be printed to the screen and saved to a new text file."""

#program
import re

madText = open('madText.txt', 'w')
text = 'An ADJECTIVE, a NOUN, a VERB and an ADVERB and a NOUN.'
madText.write(text)
madText.close()
content = re.split('(\W+)', text)

for i in content:
    if i == 'NOUN':
        content.insert(content.index('NOUN'), input('Replace ' + i + ': '))
        content.remove('NOUN')
    elif i == 'VERB':
        content.insert(content.index('VERB'), input('Replace ' + i + ': '))
        content.remove('VERB')
    elif i == 'ADVERB':
        content.insert(content.index('ADVERB'), input('Replace ' + i + ': '))
        content.remove('ADVERB')
    elif i == 'ADJECTIVE':
        content.insert(content.index('ADJECTIVE'), input('Replace ' + i + ': '))
        content.remove('ADJECTIVE')

content = ''.join(content)
print(content)
madLibs = open('madText2.txt', 'w')
madLibs.write(content)
madLibs.close()