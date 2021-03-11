#from selenium import webdriver

#driver = webdriver.Chrome("/usr/local/bin/chromedriver")
#import time
#from selenium.webdriver.common.action_chains import ActionChains
#from selenium.webdriver.chrome.options import Options

#chrome_options = Options()




import pandas as pd

df = pd.read_csv (r'/Users/gabe/Desktop/InfluencerLinks.csv')
#print(df.loc[0,0])
links = []


for index, row in df.iterrows():
    links.append(row['TikTok'])
print(links)



