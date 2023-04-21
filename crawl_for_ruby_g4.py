from bs4 import BeautifulSoup
import re
import requests

def write_file(text):
    f = open('./ruby.txt','w', encoding='utf-8')
    f.write(text)
    f.close()

# 请求ruby文法网站
resp = requests.get('https://ruby-hacking-guide.github.io/parser.html')
# 获取返回的html
html_text = resp.text
soup = BeautifulSoup(html_text, features='html.parser')
# 第四个class = longlise
tag_pre = soup.find_all(name='pre', attrs={'class':'longlist'})
print(len(tag_pre))
i = 0

for pre in tag_pre: 
    if i >= 3:
        for p in pre.children:
            print(p)

if __name__ == '__main__' :
    print("hello world" )
