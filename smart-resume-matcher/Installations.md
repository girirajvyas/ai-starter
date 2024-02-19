# Installations

## Tools
 - Anaconda for Jupyter Notebook
 - Pycharm for python files
 - Wanted to explore the advantages of both above in a single window and hence explored vscode, it works like charm
 - VS Code https://code.visualstudio.com/docs/?dv=winzip
    - Install python plugin
    - Install ipykernel

## pip installs
 - Upgrade pip: `pip install --upgrade pip`
 - Not tried yet: `pip install wheel`
 - Use conda instead of pip to install spacy (far easy then pip)
 - PyPDF2: `pip install PyPDF2`
 - python-docx: `pip install python-docx`
 - textract(convert file with any extension to text): `pip install textract`
 - Spacy: `pip install -U spacy`
 - Spacy depends on the below following modules
     - Dependent libs:
     - https://visualstudio.microsoft.com/visual-cpp-build-tools/
     - pip install cython
     - pip install preshed
     - pip install cymem
     - pip install murmurhash
     - pip install thinc
     - pip install spacy
     - setuptools wheel 'cython>=0.25' 'cymem>=2.0.2,<2.1.0' 'preshed>=3.0.2,<3.1.0' 'murmurhash>=0.28.0,<1.1.0' thinc==7.4.1

## conda installs
 - Upgrade Conda: `conda update -n base -c defaults conda`
 - Spacy: `conda install -c conda-forge spacy`
     - After installation you need to download a language model. For more info and available models, see the docs on models.  
     - Command: `python -m spacy download en_core_web_sm` (Run this from conda cmd, normal cmd gives error)  
     - Usage:  
     - `import spacy`  
     - `nlp = spacy.load("en_core_web_sm")`  

## Technology stack
 - use 'spacy' for word and phrase matching
 - 'Matplotlib' for data visualization
 - PDFminer or PyPDF2 for reading pdf
 - for reading word
       - https://automatetheboringstuff.com/chapter13/ or
       - https://www.tutorialspoint.com/python_text_processing/python_process_word_document.htm


## Issues log
 - **Runtime issues**
     - https://stackoverflow.com/questions/50483235/python-cannot-install-module-spacy

 - **Python related**
     - https://stackoverflow.com/questions/53312590/how-can-i-check-all-the-installed-python-versions-on-windows
     - https://stackoverflow.com/questions/44515769/conda-is-not-recognized-as-internal-or-external-command

## Logs
-------------> install Spacy via conda
C:\WINDOWS\system32>conda install -c conda-forge spacy
Collecting package metadata (current_repodata.json): done
Solving environment: done

==> WARNING: A newer version of conda exists. <==
  current version: 4.8.2
  latest version: 4.8.5

Please update conda by running
    $ conda update -n base -c defaults conda
 Package Plan ##

  environment location: C:\ProgramData\Anaconda3
  added / updated specs:
    - spacy
The following NEW packages will be INSTALLED:
  catalogue          conda-forge/noarch::catalogue-1.0.0-py_0
  cymem              conda-forge/win-64::cymem-2.0.3-py37h1834ac0_2
  cython-blis        conda-forge/win-64::cython-blis-0.4.1-py37h8055547_1
  importlib-metadata conda-forge/win-64::importlib-metadata-2.0.0-py37hc8dfbb8_0
  murmurhash         conda-forge/win-64::murmurhash-1.0.0-py37h63f7a3c_0
  plac               pkgs/main/win-64::plac-0.9.6-py37_1
  preshed            conda-forge/win-64::preshed-3.0.2-py37h1834ac0_3
  python_abi         conda-forge/win-64::python_abi-3.7-1_cp37m
  spacy              conda-forge/win-64::spacy-2.3.2-py37h1fb7aa8_0
  srsly              conda-forge/win-64::srsly-1.0.2-py37h1834ac0_0
  thinc              conda-forge/win-64::thinc-7.4.1-py37h1fb7aa8_0
  wasabi             conda-forge/noarch::wasabi-0.8.0-pyh9f0ad1d_0
The following packages will be UPDATED:
  conda                       pkgs/main::conda-4.8.2-py37_0 --> conda-forge::conda-4.8.5-py37hc8dfbb8_1
Proceed ([y]/n)? y

Preparing transaction: done
Verifying transaction: done
Executing transaction: done

--------------> Error:
ModuleNotFoundError: No module named 'spacy'
ModuleNotFoundError: No module named 'gensim'
ModuleNotFoundError: No module named 'en_core_web_sm'

--------------> Spacy download language logs
(base) C:\Users\giriraj_vyas>python -m spacy download en_core_web_sm
Collecting en_core_web_sm==2.3.1
  Downloading https://github.com/explosion/spacy-models/releases/download/en_core_web_sm-2.3.1/en_core_web_sm-2.3.1.tar.gz (12.0 MB)
     |████████████████████████████████| 12.0 MB 218 kB/s
Requirement already satisfied: spacy<2.4.0,>=2.3.0 in c:\programdata\anaconda3\lib\site-packages (from en_core_web_sm==2.3.1) (2.3.2)
Requirement already satisfied: requests<3.0.0,>=2.13.0 in c:\programdata\anaconda3\lib\site-packages (from spacy<2.4.0,>=2.3.0->en_core_web_sm==2.3.1) (2.22.0)
Requirement already satisfied: blis<0.5.0,>=0.4.0 in c:\programdata\anaconda3\lib\site-packages (from spacy<2.4.0,>=2.3.0->en_core_web_sm==2.3.1) (0.4.1)
Requirement already satisfied: srsly<1.1.0,>=1.0.2 in c:\programdata\anaconda3\lib\site-packages (from spacy<2.4.0,>=2.3.0->en_core_web_sm==2.3.1) (1.0.2)
Requirement already satisfied: wasabi<1.1.0,>=0.4.0 in c:\programdata\anaconda3\lib\site-packages (from spacy<2.4.0,>=2.3.0->en_core_web_sm==2.3.1) (0.8.0)
Requirement already satisfied: thinc==7.4.1 in c:\programdata\anaconda3\lib\site-packages (from spacy<2.4.0,>=2.3.0->en_core_web_sm==2.3.1) (7.4.1)
Requirement already satisfied: tqdm<5.0.0,>=4.38.0 in c:\programdata\anaconda3\lib\site-packages (from spacy<2.4.0,>=2.3.0->en_core_web_sm==2.3.1) (4.42.1)
Requirement already satisfied: setuptools in c:\programdata\anaconda3\lib\site-packages (from spacy<2.4.0,>=2.3.0->en_core_web_sm==2.3.1) (45.2.0.post20200210)
Requirement already satisfied: murmurhash<1.1.0,>=0.28.0 in c:\programdata\anaconda3\lib\site-packages (from spacy<2.4.0,>=2.3.0->en_core_web_sm==2.3.1) (1.0.0)
Requirement already satisfied: plac<1.2.0,>=0.9.6 in c:\programdata\anaconda3\lib\site-packages (from spacy<2.4.0,>=2.3.0->en_core_web_sm==2.3.1) (0.9.6)
Requirement already satisfied: cymem<2.1.0,>=2.0.2 in c:\programdata\anaconda3\lib\site-packages (from spacy<2.4.0,>=2.3.0->en_core_web_sm==2.3.1) (2.0.3)
Requirement already satisfied: catalogue<1.1.0,>=0.0.7 in c:\programdata\anaconda3\lib\site-packages (from spacy<2.4.0,>=2.3.0->en_core_web_sm==2.3.1) (1.0.0)
Requirement already satisfied: preshed<3.1.0,>=3.0.2 in c:\programdata\anaconda3\lib\site-packages (from spacy<2.4.0,>=2.3.0->en_core_web_sm==2.3.1) (3.0.2)
Requirement already satisfied: numpy>=1.15.0 in c:\programdata\anaconda3\lib\site-packages (from spacy<2.4.0,>=2.3.0->en_core_web_sm==2.3.1) (1.18.1)
Requirement already satisfied: idna<2.9,>=2.5 in c:\programdata\anaconda3\lib\site-packages (from requests<3.0.0,>=2.13.0->spacy<2.4.0,>=2.3.0->en_core_web_sm==2.3.1) (2.8)
Requirement already satisfied: certifi>=2017.4.17 in c:\programdata\anaconda3\lib\site-packages (from requests<3.0.0,>=2.13.0->spacy<2.4.0,>=2.3.0->en_core_web_sm==2.3.1) (2019.11.28)
Requirement already satisfied: chardet<3.1.0,>=3.0.2 in c:\programdata\anaconda3\lib\site-packages (from requests<3.0.0,>=2.13.0->spacy<2.4.0,>=2.3.0->en_core_web_sm==2.3.1) (3.0.4)
Requirement already satisfied: urllib3!=1.25.0,!=1.25.1,<1.26,>=1.21.1 in c:\programdata\anaconda3\lib\site-packages (from requests<3.0.0,>=2.13.0->spacy<2.4.0,>=2.3.0->en_core_web_sm==2.3.1) (1.25.8)
Requirement already satisfied: importlib-metadata>=0.20; python_version < "3.8" in c:\programdata\anaconda3\lib\site-packages (from catalogue<1.1.0,>=0.0.7->spacy<2.4.0,>=2.3.0->en_core_web_sm==2.3.1) (2.0.0)
Requirement already satisfied: zipp>=0.5 in c:\programdata\anaconda3\lib\site-packages (from importlib-metadata>=0.20; python_version < "3.8"->catalogue<1.1.0,>=0.0.7->spacy<2.4.0,>=2.3.0->en_core_web_sm==2.3.1) (2.2.0)
Building wheels for collected packages: en-core-web-sm
  Building wheel for en-core-web-sm (setup.py) ... done
  Created wheel for en-core-web-sm: filename=en_core_web_sm-2.3.1-py3-none-any.whl size=12047114 sha256=7abd3fd574b87ac3fa04b87028641ceae5899c2e806cdfa8c00701176ccbc2e8
  Stored in directory: C:\Users\GIRIRA~1\AppData\Local\Temp\pip-ephem-wheel-cache-dg2pp0dc\wheels\b7\0d\f0\7ecae8427c515065d75410989e15e5785dd3975fe06e795cd9
Successfully built en-core-web-sm
Installing collected packages: en-core-web-sm
Successfully installed en-core-web-sm-2.3.1
✔ Download and installation successful
You can now load the model via spacy.load('en_core_web_sm')

(base) C:\Users\giriraj_vyas>

-----------------------> ipykernel installation logs
Loading personal and system profiles took 676ms.
PS C:\Users\giriraj_vyas> & C:/Users/giriraj_vyas/AppData/Local/Programs/Python/Python38-32/python.exe c:\Users\giriraj_vyas\.vscode\extensions\ms-python.python-2020.9.114305\pythonFiles\pyvsc-run-isolated.py c:\Users\giriraj_vyas\.vscode\extensions\ms-python.python-2020.9.114305\pythonFiles\shell_exec.py C:/Users/giriraj_vyas/AppData/Local/Programs/Python/Python38-32/python.exe c:\Users\giriraj_vyas\.vscode\extensions\ms-python.python-2020.9.114305\pythonFiles\pyvsc-run-isolated.py pip install -U ipykernel --user C:/Users/GIRIRA~1/AppData/Local/Temp/tmp-21252zw5FfapbsbhV.log  
Executing command in shell >> C:/Users/giriraj_vyas/AppData/Local/Programs/Python/Python38-32/python.exe c:\Users\giriraj_vyas\.vscode\extensions\ms-python.python-2020.9.114305\pythonFiles\pyvsc-run-isolated.py pip install -U ipykernel --user
Collecting ipykernel
  Downloading ipykernel-5.3.4-py3-none-any.whl (120 kB)
     |████████████████████████████████| 120 kB 136 kB/s 
Collecting tornado>=4.2
  Downloading tornado-6.0.4-cp38-cp38-win32.whl (416 kB)
     |████████████████████████████████| 416 kB 97 kB/s 
Collecting jupyter-client
  Downloading jupyter_client-6.1.7-py3-none-any.whl (108 kB)
     |████████████████████████████████| 108 kB 159 kB/s 
Collecting traitlets>=4.1.0
  Downloading traitlets-5.0.5-py3-none-any.whl (100 kB)
     |████████████████████████████████| 100 kB 186 kB/s 
Collecting ipython>=5.0.0
  Downloading ipython-7.18.1-py3-none-any.whl (786 kB)
     |████████████████████████████████| 786 kB 163 kB/s 
Collecting jupyter-core>=4.6.0
  Downloading jupyter_core-4.6.3-py2.py3-none-any.whl (83 kB)
     |████████████████████████████████| 83 kB 83 kB/s 
Collecting python-dateutil>=2.1
  Downloading python_dateutil-2.8.1-py2.py3-none-any.whl (227 kB)
     |████████████████████████████████| 227 kB 133 kB/s 
Collecting pyzmq>=13
  Downloading pyzmq-19.0.2-cp38-cp38-win32.whl (901 kB)
     |████████████████████████████████| 901 kB 172 kB/s 
Collecting ipython-genutils
  Downloading ipython_genutils-0.2.0-py2.py3-none-any.whl (26 kB)
Collecting decorator
  Downloading decorator-4.4.2-py2.py3-none-any.whl (9.2 kB)
Collecting colorama; sys_platform == "win32"
  Downloading colorama-0.4.4-py2.py3-none-any.whl (16 kB)
Collecting pygments
  Downloading Pygments-2.7.1-py3-none-any.whl (944 kB)
     |████████████████████████████████| 944 kB 285 kB/s 
Collecting backcall
  Downloading backcall-0.2.0-py2.py3-none-any.whl (11 kB)
Collecting jedi>=0.10
  Downloading jedi-0.17.2-py2.py3-none-any.whl (1.4 MB)
     |████████████████████████████████| 1.4 MB 327 kB/s 
Collecting pickleshare
  Downloading pickleshare-0.7.5-py2.py3-none-any.whl (6.9 kB)
Requirement already satisfied, skipping upgrade: setuptools>=18.5 in c:\users\giriraj_vyas\appdata\local\programs\python\python38-32\lib\site-packages (from ipython>=5.0.0->ipykernel) (50.3.0)
Collecting prompt-toolkit!=3.0.0,!=3.0.1,<3.1.0,>=2.0.0
  Downloading prompt_toolkit-3.0.8-py3-none-any.whl (355 kB)
     |████████████████████████████████| 355 kB 148 kB/s 
Collecting pywin32>=1.0; sys_platform == "win32"
  Downloading pywin32-228-cp38-cp38-win32.whl (8.4 MB)
     |████████████████████████████████| 8.4 MB 21 kB/s 
Collecting six>=1.5
  Downloading six-1.15.0-py2.py3-none-any.whl (10 kB)
Collecting parso<0.8.0,>=0.7.0
  Downloading parso-0.7.1-py2.py3-none-any.whl (109 kB)
     |████████████████████████████████| 109 kB 145 kB/s 
Collecting wcwidth
  Downloading wcwidth-0.2.5-py2.py3-none-any.whl (30 kB)
Installing collected packages: tornado, ipython-genutils, traitlets, pywin32, jupyter-core, six, python-dateutil, pyzmq, jupyter-client, decorator, colorama, pygments, backcall, parso, jedi, pickleshare, wcwidth, prompt-toolkit, ipython, ipykernel
  WARNING: The scripts jupyter-migrate.exe, jupyter-troubleshoot.exe and jupyter.exe are installed in 'C:\Users\giriraj_vyas\AppData\Roaming\Python\Python38\Scripts' which is not on PATH.
  Consider adding this directory to PATH or, if you prefer to suppress this warning, use --no-warn-script-location.
  WARNING: The scripts jupyter-kernel.exe, jupyter-kernelspec.exe and jupyter-run.exe are installed in 'C:\Users\giriraj_vyas\AppData\Roaming\Python\Python38\Scripts' which is not on PATH.
  Consider adding this directory to PATH or, if you prefer to suppress this warning, use --no-warn-script-location.
  WARNING: The script pygmentize.exe is installed in 'C:\Users\giriraj_vyas\AppData\Roaming\Python\Python38\Scripts' which is not on PATH.        
  Consider adding this directory to PATH or, if you prefer to suppress this warning, use --no-warn-script-location.
  WARNING: The scripts iptest.exe, iptest3.exe, ipython.exe and ipython3.exe are installed in 'C:\Users\giriraj_vyas\AppData\Roaming\Python\Python38\Scripts' which is not on PATH.
  Consider adding this directory to PATH or, if you prefer to suppress this warning, use --no-warn-script-location.
Successfully installed backcall-0.2.0 colorama-0.4.4 decorator-4.4.2 ipykernel-5.3.4 ipython-7.18.1 ipython-genutils-0.2.0 jedi-0.17.2 jupyter-client-6.1.7 jupyter-core-4.6.3 parso-0.7.1 pickleshare-0.7.5 prompt-toolkit-3.0.8 pygments-2.7.1 python-dateutil-2.8.1 pywin32-228 pyzmq-19.0.2 six-1.15.0 tornado-6.0.4 traitlets-5.0.5 wcwidth-0.2.5
WARNING: You are using pip version 20.2.3; however, version 20.2.4 is available.
You should consider upgrading via the 'C:\Users\giriraj_vyas\AppData\Local\Programs\Python\Python38-32\python.exe -m pip install --upgrade pip' command.
PS C:\Users\giriraj_vyas> 

------------------> Upgrading pip
PS C:\Users\giriraj_vyas> C:\Users\giriraj_vyas\AppData\Local\Programs\Python\Python38-32\python.exe -m pip install --upgrade pip
Collecting pip
  Downloading pip-20.2.4-py2.py3-none-any.whl (1.5 MB)
     |████████████████████████████████| 1.5 MB 126 kB/s 
Installing collected packages: pip
  Attempting uninstall: pip
    Found existing installation: pip 20.2.3
    Uninstalling pip-20.2.3:
      Successfully uninstalled pip-20.2.3
Successfully installed pip-20.2.4
PS C:\Users\giriraj_vyas> 

-----------------> pslinter
Loading personal and system profiles took 607ms.
PS C:\Users\giriraj_vyas\Downloads\Resume_Filtering> & C:/Users/giriraj_vyas/AppData/Local/Programs/Python/Python38-32/python.exe c:\Users\giriraj_vyas\.vscode\extensions\ms-python.python-2020.9.114305\pythonFiles\pyvsc-run-isolated.py pip install -U pylint --user
Collecting pylint
  Downloading pylint-2.6.0-py3-none-any.whl (325 kB)
     |████████████████████████████████| 325 kB 1.1 MB/s 
Collecting isort<6,>=4.2.5
  Downloading isort-5.6.4-py3-none-any.whl (98 kB)
     |████████████████████████████████| 98 kB 725 kB/s 
Collecting toml>=0.7.1
  Downloading toml-0.10.1-py2.py3-none-any.whl (19 kB)
Collecting mccabe<0.7,>=0.6
  Downloading mccabe-0.6.1-py2.py3-none-any.whl (8.6 kB)
Requirement already satisfied, skipping upgrade: colorama; sys_platform == "win32" in c:\users\giriraj_vyas\appdata\roaming\python\python38\site-packages (from pylint) (0.4.4)
Collecting astroid<=2.5,>=2.4.0
  Downloading astroid-2.4.2-py3-none-any.whl (213 kB)
     |████████████████████████████████| 213 kB 1.7 MB/s 
Requirement already satisfied, skipping upgrade: six~=1.12 in c:\users\giriraj_vyas\appdata\roaming\python\python38\site-packages (from astroid<=2.5,>=2.4.0->pylint) (1.15.0)
Collecting wrapt~=1.11
  Downloading wrapt-1.12.1.tar.gz (27 kB)
Collecting lazy-object-proxy==1.4.*
  Downloading lazy_object_proxy-1.4.3-cp38-cp38-win32.whl (18 kB)
Using legacy 'setup.py install' for wrapt, since package 'wheel' is not installed.
Installing collected packages: isort, toml, mccabe, wrapt, lazy-object-proxy, astroid, pylint
  WARNING: The script isort.exe is installed in 'C:\Users\giriraj_vyas\AppData\Roaming\Python\Python38\Scripts' which is not on PATH.
  Consider adding this directory to PATH or, if you prefer to suppress this warning, use --no-warn-script-location.
    Running setup.py install for wrapt ... done
  WARNING: The scripts epylint.exe, pylint.exe, pyreverse.exe and symilar.exe are installed in 'C:\Users\giriraj_vyas\AppData\Roaming\Python\Python38\Scripts' which is not on PATH.
  Consider adding this directory to PATH or, if you prefer to suppress this warning, use --no-warn-script-location.
Successfully installed astroid-2.4.2 isort-5.6.4 lazy-object-proxy-1.4.3 mccabe-0.6.1 pylint-2.6.0 toml-0.10.1 wrapt-1.12.1
PS C:\Users\giriraj_vyas\Downloads\Resume_Filtering>

-----------> PyPDF2
PS D:\Sources\smart-matcher> pip install PyPDF2
Collecting PyPDF2
  Downloading PyPDF2-1.26.0.tar.gz (77 kB)
     |████████████████████████████████| 77 kB 59 kB/s 
Using legacy 'setup.py install' for PyPDF2, since package 'wheel' is not installed.
Installing collected packages: PyPDF2
    Running setup.py install for PyPDF2 ... done
Successfully installed PyPDF2-1.26.0

------------> python-docx
PS D:\Sources\smart-matcher> pip install python-docx
Collecting python-docx
  Downloading python-docx-0.8.10.tar.gz (5.5 MB)
     |████████████████████████████████| 5.5 MB 126 kB/s 
Collecting lxml>=2.3.2
  Downloading lxml-4.6.1-cp38-cp38-win32.whl (3.2 MB)
     |████████████████████████████████| 3.2 MB 111 kB/s 
Using legacy 'setup.py install' for python-docx, since package 'wheel' is not installed.
Installing collected packages: lxml, python-docx
    Running setup.py install for python-docx ... done
Successfully installed lxml-4.6.1 python-docx-0.8.10
PS D:\Sources\smart-matcher>

-------------> textract
PS D:\Sources\smart-matcher> pip install textract
Collecting textract
  Downloading textract-1.6.3-py3-none-any.whl (21 kB)
Collecting extract-msg==0.23.1
  Downloading extract_msg-0.23.1-py2.py3-none-any.whl (45 kB)
     |████████████████████████████████| 45 kB 130 kB/s 
Collecting pdfminer.six==20181108
  Downloading pdfminer.six-20181108-py2.py3-none-any.whl (5.6 MB)
     |████████████████████████████████| 5.6 MB 467 kB/s 
Collecting SpeechRecognition==3.8.1
  Downloading SpeechRecognition-3.8.1-py2.py3-none-any.whl (32.8 MB)
     |████████████████████████████████| 32.8 MB 26 kB/s 
Collecting chardet==3.0.4
  Downloading chardet-3.0.4-py2.py3-none-any.whl (133 kB)
     |████████████████████████████████| 133 kB 109 kB/s 
Collecting python-pptx==0.6.18
  Downloading python-pptx-0.6.18.tar.gz (8.9 MB)
     |████████████████████████████████| 8.9 MB 544 kB/s 
Collecting EbookLib==0.17.1
  Downloading EbookLib-0.17.1.tar.gz (111 kB)
     |████████████████████████████████| 111 kB 504 kB/s 
Collecting docx2txt==0.8
  Downloading docx2txt-0.8.tar.gz (2.8 kB)
Collecting argcomplete==1.10.0
  Downloading argcomplete-1.10.0-py2.py3-none-any.whl (31 kB)
Collecting beautifulsoup4==4.8.0
  Downloading beautifulsoup4-4.8.0-py3-none-any.whl (97 kB)
     |████████████████████████████████| 97 kB 195 kB/s 
Collecting xlrd==1.2.0
  Downloading xlrd-1.2.0-py2.py3-none-any.whl (103 kB)
     |████████████████████████████████| 103 kB 261 kB/s 
Collecting six==1.12.0
  Downloading six-1.12.0-py2.py3-none-any.whl (10 kB)
Collecting tzlocal==1.5.1
  Downloading tzlocal-1.5.1.tar.gz (16 kB)
Collecting olefile==0.46
  Downloading olefile-0.46.zip (112 kB)
     |████████████████████████████████| 112 kB 312 kB/s 
Collecting imapclient==2.1.0
  Downloading IMAPClient-2.1.0-py2.py3-none-any.whl (73 kB)
     |████████████████████████████████| 73 kB 148 kB/s 
Collecting sortedcontainers
  Downloading sortedcontainers-2.2.2-py2.py3-none-any.whl (29 kB)
Collecting pycryptodome
  Downloading pycryptodome-3.9.8-cp38-cp38-win32.whl (14.1 MB)
     |████████████████████████████████| 14.1 MB 66 kB/s 
Requirement already satisfied: lxml>=3.1.0 in c:\users\giriraj_vyas\appdata\local\programs\python\python38-32\lib\site-packages (from python-pptx==0.6.18->textract) (4.6.1)
Collecting Pillow>=3.3.2
  Downloading Pillow-8.0.1-cp38-cp38-win32.whl (1.9 MB)
     |████████████████████████████████| 1.9 MB 252 kB/s 
Collecting XlsxWriter>=0.5.7
  Downloading XlsxWriter-1.3.7-py2.py3-none-any.whl (144 kB)
     |████████████████████████████████| 144 kB 327 kB/s 
Requirement already satisfied: soupsieve>=1.2 in c:\users\giriraj_vyas\appdata\local\programs\python\python38-32\lib\site-packages (from beautifulsoup4==4.8.0->textract) (2.0)
Collecting pytz
  Downloading pytz-2020.1-py2.py3-none-any.whl (510 kB)
     |████████████████████████████████| 510 kB 327 kB/s 
Using legacy 'setup.py install' for python-pptx, since package 'wheel' is not installed.
Using legacy 'setup.py install' for EbookLib, since package 'wheel' is not installed.
Using legacy 'setup.py install' for docx2txt, since package 'wheel' is not installed.
Using legacy 'setup.py install' for tzlocal, since package 'wheel' is not installed.
Using legacy 'setup.py install' for olefile, since package 'wheel' is not installed.
Installing collected packages: pytz, tzlocal, olefile, six, imapclient, extract-msg, sortedcontainers, pycryptodome, pdfminer.six, SpeechRecognition, chardet, Pillow, XlsxWriter, python-pptx, EbookLib, docx2txt, argcomplete, beautifulsoup4, xlrd, textract
    Running setup.py install for tzlocal ... done
    Running setup.py install for olefile ... done
  Attempting uninstall: six
    Found existing installation: six 1.15.0
    Uninstalling six-1.15.0:
      Successfully uninstalled six-1.15.0
    Running setup.py install for python-pptx ... done
    Running setup.py install for EbookLib ... done
    Running setup.py install for docx2txt ... done
  Attempting uninstall: beautifulsoup4
    Found existing installation: beautifulsoup4 4.8.2
    Uninstalling beautifulsoup4-4.8.2:
      Successfully uninstalled beautifulsoup4-4.8.2
Successfully installed EbookLib-0.17.1 Pillow-8.0.1 SpeechRecognition-3.8.1 XlsxWriter-1.3.7 argcomplete-1.10.0 beautifulsoup4-4.8.0 chardet-3.0.4 docx2txt-0.8 extract-msg-0.23.1 imapclient-2.1.0 olefile-0.46 pdfminer.six-20181108 pycryptodome-3.9.8 python-pptx-0.6.18 pytz-2020.1 six-1.12.0 
sortedcontainers-2.2.2 textract-1.6.3 tzlocal-1.5.1 xlrd-1.2.0
PS D:\Sources\smart-matcher> 
