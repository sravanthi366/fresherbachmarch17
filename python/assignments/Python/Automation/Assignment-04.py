"""Write a program that opens all .txt files in a folder and searches for any line that matches a user-supplied regular expression. The results should be printed to the screen. """

#program
import glob, re

destFolder = 'randomFolder'
userRegex = input('Enter your regular expression:\n')

print('We found the following lines matching your regular expression:')
for fileName in glob.glob(destFolder + '/*.txt'):
	txtFile = open(fileName, 'r')
	pattern = re.compile(r"%s"%userRegex)
	for line in txtFile:
		if re.search(pattern, line) is not None:
			print(line, end='')
	txtFile.close()