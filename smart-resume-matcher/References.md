# Challenges

## Convert docx, pdf, doc to text
We have tried different libraries for doing this job, the result is as below:  

  - `textract (https://textract.readthedocs.io/en/stable/)`: We tried this initially to get rid of pain of managing the conversion of different file types to text as it provided the in build mechanism of calling different modules by itself and finally providing the text as output. But, this does not seem to be much compatible with windows environment as we do not have `antiword` module that converts `.doc` to `.docx` for processing the word files. we were even facig the challenge of converting the pdf as well. Hence, skipped this implemenrtation. Refer `word_&_pdf_to_txt_converters\ConvertAnythingTotext_Textract.ipynb` 
  - `PyPDF2`: 




## Notes - Jabda

**Flow:**  
 - Training
 - Validation
 - Test

Corpus should be:

Search for a already trained model

Learning objective:
word to vector () randomly initialized vector


bpemb - byte pair embedding

open points
rnn?

tokenization (used more)
Lemmatization and stemming (not used much)
ing, s -> 

1. Create keywords list from JD - word match in CVs
2. Word2Vec - find words near words (has limitations)

models:
reuse spacy models
how to get this trained model
 - 

use correct vector
 - train from word2vec
 -

Take pretrained models
and fine tune according to your need

## NLP basics

 - Represent Words to vectors 
   - 1 hot vector, 
   - count vector, 
   - word vector using neural network, 
   - glove vectors (good in case data is varied)
   - Spacy ignores the a , and like similar words
   - tf i df -> term frequency inverse document frequency
   - Cosine is for finding the distance
 - Trained vectors are used as a dictionary

## Already implemented solutions
 - https://github.com/prateekguptaiiitk/Resume_Filtering
 - https://towardsdatascience.com/do-the-keywords-in-your-resume-aptly-represent-what-type-of-data-scientist-you-are-59134105ba0d
 - https://www.i2tutorials.com/resume-filtering-using-nlp/
 - https://github.com/rsalaza4/Resume-Screening
 - Deep learning: https://medium.com/@nuripurswani/word2vec-for-talent-acquisition-ab20a23e01d8
 - Rating the resume: https://discuss.analyticsvidhya.com/t/which-is-best-technique-for-giving-rating-or-scoring-for-resume-analysis/66490/17
 - https://github.com/outsideken/Resumes
 - https://dzone.com/articles/cv-r-cvs-retrieval-system-based-on-job-description
 - https://www.kaggle.com/dhainjeamita/resume-classification/data

## Similar solution
 - https://github.com/binoydutt/Resume-Job-Description-Matching
 - https://www.kaggle.com/dhainjeamita/resume-classification

## Good reads
 - Spacy: https://spacy.io/usage/spacy-101
 - https://medium.com/@randerson112358/resume-scanner-2c30f5baf92c
 - https://towardsdatascience.com/resume-screening-with-python-1dea360be49b
 
## References:
 - https://automatetheboringstuff.com/chapter13/
 
## Flow in typical java app:

 - read doc, docx, pdf
 - create map of candidate name and his skill sets
 - fetch job descriptions
 - match each job description with the candidate name
 - publish repost in Excel with jd and candidates recommended
 - system design

## Runtime issues

 - https://stackoverflow.com/questions/50483235/python-cannot-install-module-spacy

## Python related

 - https://stackoverflow.com/questions/53312590/how-can-i-check-all-the-installed-python-versions-on-windows
 - https://stackoverflow.com/questions/44515769/conda-is-not-recognized-as-internal-or-external-command

## Models
 - https://nanonets.com/blog/ocr-for-resume-parsing-deep-learning/
 - https://medium.com/@dataturks/automatic-summarization-of-resumes-with-ner-8b97a5f562b
 - https://github.com/DataTurks-Engg/Entity-Recognition-In-Resumes-SpaCy
 - https://www.kaggle.com/dhainjeamita/resume-classification/data
 - https://www.kaggle.com/dhainjeamita/resumedataset