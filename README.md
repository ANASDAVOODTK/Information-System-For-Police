# Information-System-For-Police
A Police Helping Application System

## Pycharm IDE for Python Development(optional*)

PyCharm is an integrated development environment (IDE) used in computer programming, specifically for the Python language. PyCharm is a cross-platform, with Windows, macOS and Linux versions. **[Download Pycharm](https://www.jetbrains.com/pycharm/download)** development tool.

## System Requirements

Recommended **[Linux](https://en.wikipedia.org/wiki/Linux_distribution)** Based OS(any distro*)

## Setup Procedure

```
sudo pip install virtualenv
```
**[virtualenv](https://pypi.org/project/virtualenv/)** a tool for creating isolated virtual python environments.

## New python project

```
mkdir project
cd project
virtualenv venv
```

## Boost Python

Boost.Python is a, C++ library which enables seamless interoperability between C++ and the Python programming language.<br/>
To compile Boost.Python **[download boost](http://boost.org)** and then go into the boost root folder

```
./bootstrap.sh --with-libraries=python
./b2
sudo ./b2 install
      OR   
sudo ./b2 install --without-python      
```

## dlib C++ library 
**[Dlib](https://github.com/davisking/dlib
)** is a modern C++ toolkit containing machine learning algorithms and tools for creating complex software in C++ to solve real world problems.

```
sudo apt install cmake
```

```
git clone https://github.com/davisking/dlib.git
```
```
cd dlib
mkdir build; cd build; cmake .. -DDLIB_USE_CUDA=0 -DUSE_AVX_INSTRUCTIONS=1; cmake --build .
```
```
pkg-config --libs --cflags dlib-1
```

> if an error is encoundered during the execution of the above command. You may need to instlal pkg-config.
```
sudo apt install pkg-config
```

Active python virtual enviroment and run
```
python setup.py install --set USE_AVX_INSTRUCTIONS=1 --set DLIB_USE_CUDA=0
```

## Then Open the Project in Pycharm

> intsall the essential modules like flask, face_recognisation and dlib

## Now The Environment Set-up Is Completed 
we can go to the coding part

## Screenshot
![screenshot 1](https://github.com/HacKP-CyberDome/offdeff-web/blob/master/Shots/s1.png)
![screenshot 2](https://github.com/HacKP-CyberDome/offdeff-web/blob/master/Shots/s2.png)
![screenshot 3](https://github.com/HacKP-CyberDome/offdeff-web/blob/master/Shots/s3.png)


