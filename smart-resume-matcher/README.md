# Smart Matcher

**Problem Statement:**  
 - Smart Matcher - An AI/ML based tool that is able to match incoming candidate resumes to Job Descriptions keyed in to the system.  

**Recommended Team:**  
 - 3-5 member teams. Recommended team - 1UI, 1BE, 1ML, 1QA, 1SA  

**Team Name:** G.A.S.  

**Acceptance Criteria - Old:**  
 - Identification of Top 10 Candidates from a corpus leading to their successful level-1 Interview.
 - This will be run against a corpus of existing resumes for whom the interviews were completed.
 - Solution should be workable and should pass basic scenarios listed out.
 - 3rd party libraries as per approval from the solution governance group.

**Acceptance Criteria - New:**  
 - Running your solution against a corpus of training resumes, Your top 10/N resumes will be compared against the actual data. 
 - For starter 80% will be the acceptance criteria
 - After that TA and the Judges group will evaluate the solution under a set evaluation criterias and score

## Overview
 - This is a classic problem a Talent acquisition team faces where they have to manually match the JDs with the resumes and filter the best ones accordingly. Here, We are trying to solve the same problem using ML. We will try to use different libraries and train the models accordingly to see which of the models provide the best suited result

## Sub-problems
 - Data (this has to be collected from different sources, will be provided a dummy set by organizers at start)
 - Read/parse Resumes to txt(.pdf, .doc, .docx) 

## Enhancements: 
 - Check grammatical mistakes - https://www.geeksforgeeks.org/grammar-checker-in-python-using-language-check/

## Different library options

|Sr. no| Term used                                                       | Year  |  Comment                                                   |
|-----:| ----------                                                      |:-----:|                                                            |
|  1   | [Nltk](https://en.wikipedia.org/wiki/Natural_Language_Toolkit)  | 2013  |
|  2   | [Word2vec](https://en.wikipedia.org/wiki/Word2vec)              | 2013  |
|  3   | [Glove](https://en.wikipedia.org/wiki/GloVe_(machine_learning)) | 2014  |
|  4   | [Spacy](https://en.wikipedia.org/wiki/SpaCy)                    | 2015  |
|  5   | [fastText](https://en.wikipedia.org/wiki/FastText)              | 2016  |
|  6   | [Bert](https://en.wikipedia.org/wiki/BERT_(language_model))     | 2018  | Context according to the sentence (contextualize embedding) |

## Technology stack
 - use 'spacy' for word and phrase matching
 - 'Matplotlib' for data visualization
 - PDFminer or PyPDF2 for reading pdf
 - for reading word
       - https://automatetheboringstuff.com/chapter13/ or
       - https://www.tutorialspoint.com/python_text_processing/python_process_word_document.htm

## 1. Cleaning of data (convert different types of data to txt)
 - Convert doc and pdf files into txt files
 - Before saving into txt file clean this data by removing '\n', special characters, and lowercase every letter.

## Try Brute force




