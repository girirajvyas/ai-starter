import os

def writeStrToTxt(stringContent, fileName):
    fileNameWOextension = fileName.split('.')[0]
    textFilesPath = 'D:\\Sources\\smart-matcher\\data\\dummy\\resumes_txt\\'
    print(os.path.join(textFilesPath, fileNameWOextension + '.txt'))
    f = open(os.path.join(textFilesPath, fileNameWOextension + '.txt'), 'w', encoding='utf-8')
    f.write(stringContent)
    f.close()

