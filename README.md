# ai-starter
Exploration of different possibilities of AI.

High level topics
1. AI
2. ML
3. Deep Learning
4. Generative AI

# 1. AI
**1. Overview of Artificial Intelligence and its applications**

**Overview**  
Artificial Intelligence (AI) is a branch of computer science that focuses on creating systems capable of performing tasks that would normally require human intelligence. These tasks include learning, reasoning, problem-solving, perception, and language understanding. AI applications span a wide range of industries, including healthcare, finance, gaming, and more.

**Applications of AI:**  
- **Natural Language Processing (NLP):** Understanding and processing human language.
- **Computer Vision:** Teaching machines to interpret and understand visual information.
- **Machine Learning:** Algorithms that enable computers to learn patterns and make predictions.
- **Speech Recognition:** Converting spoken language into text.
- **Recommendation Systems:** Suggesting items based on user preferences.
- **Autonomous Vehicles:** Using AI to enable self-driving cars.

# 2. ML


# 3. Deep Learning


# 4. Generative AI

## What is Generative AI
Generative AI, also known as Generative Artificial Intelligence, refers to a category of artificial intelligence techniques that aim to generate new, original content rather than simply processing and analyzing existing data. Instead of relying solely on pre-existing examples, generative AI models have the ability to create new and unique outputs by learning patterns and structures from training data.  
Generative AI models are designed to mimic human creativity and produce outputs that resemble those created by humans. These models can generate a wide range of content, such as images, text, music, videos, and even realistic human faces.  

There are different approaches to generative AI, but one popular method is the use of generative adversarial networks (GANs). GANs consist of two main components: a generator and a discriminator. The generator learns to generate new content, while the discriminator tries to distinguish between the generated content and real examples. Through an adversarial training process, the generator gets better at producing content that is increasingly difficult for the discriminator to distinguish from real data.

Generative AI has found applications in various fields. For example, it can be used in art and design to generate new visual or musical creations. It can also be employed in data augmentation, where synthetic data is generated to enhance the training of machine learning models. Additionally, generative AI has been used in areas such as image synthesis, text generation, video generation, and even in healthcare for tasks like generating synthetic medical images.

However, it's important to note that generative AI also raises ethical considerations, as the technology can be misused to create fake content or deceive people. Therefore, responsible and ethical use of generative AI is crucial to avoid potential negative consequences.

## What is Large Language Models
A large language model is an artificial intelligence model specifically designed to understand and generate human language. These models are trained on massive amounts of text data to learn the statistical patterns and relationships within language.

Large language models, such as OpenAI's GPT-3 (Generative Pre-trained Transformer 3), are based on deep learning techniques, particularly transformer architectures. These models consist of multiple layers of neural networks that process and analyze language data, allowing them to understand context, syntax, semantics, and even generate coherent text.

The training process of a large language model typically involves exposing the model to a vast corpus of text from sources like books, articles, websites, and other textual data available on the internet. The model learns from this data by predicting the next word in a sentence or filling in missing words. Through this process, the model acquires a broad understanding of language and can generate human-like responses given appropriate prompts.

Large language models can be used for a variety of natural language processing (NLP) tasks, including text completion, language translation, sentiment analysis, question answering, text summarization, and more. They have been particularly notable for their ability to generate coherent and contextually relevant text given a prompt.

However, it's important to note that large language models are not inherently knowledgeable or capable of understanding the world in the same way humans do. They rely solely on statistical patterns in the training data and do not possess true understanding or consciousness. While they can provide impressive outputs, they can also produce inaccurate or biased information if the training data contains biases or misleading content.

Large language models have various applications, such as chatbots, virtual assistants, content generation, language translation, and even assisting with coding tasks. Their potential impact on various industries and domains continues to evolve as researchers and developers explore new ways to leverage their capabilities.

## Are Generative AI and Large Language Models the same?
Generative AI and large language models are related concepts, but they are not exactly the same.

Generative AI is a broader term that encompasses a wide range of artificial intelligence techniques aimed at generating new and original content. It refers to AI models that can create outputs that resemble human creations, such as images, music, text, videos, and more. Generative AI models can utilize various methods, including generative adversarial networks (GANs), variational autoencoders (VAEs), and other techniques, to generate new content.

On the other hand, large language models are a specific type of generative AI model that focuses on generating and understanding human language. These models, such as OpenAI's GPT-3, are trained on vast amounts of text data to learn the statistical patterns and structures of language. They can generate coherent and contextually relevant text given a prompt, and they excel at tasks such as text completion, language translation, sentiment analysis, and question answering.

So, while large language models are a subset of generative AI models specifically tailored for language-related tasks, generative AI encompasses a broader set of techniques that can generate content beyond just language.

It's worth noting that large language models like GPT-3 can exhibit generative capabilities within the domain of language. They can generate coherent and contextually relevant text that resembles human writing. However, generative AI as a whole includes a wider range of techniques and applications beyond language generation.

## Different Application creation
 - Consume ChatGPT APIs 
 - Web scraper 

## Acronyms
 - GPT - Generative Pre-trained Transformers

## Sample Prompts

### Sample 1:
 - Write a code for spring boot crud application for student management system using spring boot and in memory database?
 - Write code for application.properties file
 - Write the code for exception ResourceNotFound Exception

### Sample 2:
 - Show me the project structure for a spring boot 3.0 project with a rest controller and a package name of io.github.girirajvyas.chatgpt
 - What are linux commands to create this directory structure
 - Create a main method for a spring boot 3.0 application in a class called ChatGPTSpringBootAppication with a package name of io.github.girirajvyas.chatgpt
 - Create a rest controller for spring boot 3.0 application in a class called ChatGptCOntroller with a package name of io.github.girirajvyas.chatgpt.controller
 - Create a pom file for a spring boot 3.0 application that includes the web starter project and add a property of Java 17

### Sample 3:
 - We are trying to create a travel booking application for our client and want to propose the detailed architecture along with the code for the same, Can you help in generating high level Epics, features and stories followed by architecture and actual code in java using spring boot

## Different tools and its versions

### ChatGPT
 - URL: https://chat.openai.com/

| Version | Released      | Training Data                                             | Max Sequence length | Advantages  | Limitations | Paramerters count |
| ---     | ---           | ---                                                       |---                  | ---         | ---         | ---               |
| GPT-1   | June 2018     | Common Crawl, BookCorpus                                  | 1024                |             |             | 117 Million       |
| GPT-2   | February 2019 | Common Crawl, BookCorpus, WebText                         | 2048                |             |             | 1.5 Billion       |
| GPT-3   | June 2020     | Common Crawl, BookCorpus, Wikipedia, Books, Articles, etc | 4096                |             |             | 1.5 Billion       |
| GPT-4   | March 2023    | Unknown                                                   | Unknown             |             |             | 1.5 Billion       |

### Open AI Playground

Open AI Playground vs ChatGPT: https://www.lifewire.com/openai-playground-vs-chatgpt-7371455

### Azure Open AI
 - https://azure.microsoft.com/en-us/blog/chatgpt-is-now-available-in-azure-openai-service/
 - GitHub Copilot leverages AI models in Azure OpenAI Service to help developers accelerate code development with its AI pair programmer.
 - OpenAI Codex is the model based on GPT-3 that powers GitHub Copilot - a tool from GitHub to generate code within mainstream development environments including VS Code, Neovim, JetBrains, and even in the cloud with GitHub Codespaces.

### Google Bard
 - URL: https://bard.google.com/

# References
 - AI
   - https://serokell.io/blog/ai-ml-dl-difference   
 - Generative AI
   - https://platform.openai.com/examples
   - https://platform.openai.com/docs/libraries/community-libraries
     - https://github.com/TheoKanning/openai-java
   - https://firstfinger.in/chatgpt-character-limit/
