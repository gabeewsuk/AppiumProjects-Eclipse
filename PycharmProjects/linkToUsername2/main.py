#from selenium import webdriver

#driver = webdriver.Chrome("/usr/local/bin/chromedriver")
#import time
#from selenium.webdriver.common.action_chains import ActionChains
#from selenium.webdriver.chrome.options import Options

#chrome_options = Options()

import csv

import pandas as pd

df = pd.read_csv (r'/Users/gabe/Desktop/InfluencerLinks.csv')
#print(df.loc[0,0])
links = []


for index, row in df.iterrows():
    links.append(row['TikTok'])
print(links)

from selenium import webdriver

#driver = webdriver.Chrome("/usr/local/bin/chromedriver")
import time
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.chrome.options import Options

chrome_options = Options()
from selenium.webdriver.common.keys import Keys
driver = webdriver.Chrome("/usr/local/bin/chromedriver2", options = chrome_options)
usernameTTList = []
for x in links:
    try:
        driver.get(x)
    except:
        print("link does not work")


    time.sleep(2)
    try:
        element = driver.find_element_by_xpath('//*[@id="main"]/div[2]/div[2]/div/header/div[1]/div[2]/h2')
        usernameTT = element.text
        usernameTTList.append(usernameTT)
        print(usernameTT)
    except:
        print(x + "does not exist anymore")





df = pd.DataFrame(usernameTTList)
df.to_csv('UserNamesForSuggested.csv', index=False)