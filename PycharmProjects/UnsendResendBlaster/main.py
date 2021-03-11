from selenium import webdriver

driver = webdriver.Chrome("/usr/local/bin/chromedriver")
import time
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.chrome.options import Options

chrome_options = Options()
from selenium.webdriver.common.keys import Keys
#driver = webdriver.Chrome("/usr/local/bin/chromedriver", options = chrome_options)
driver.get('https://instagram.com')
time.sleep(6)
element = driver.find_element_by_xpath('//*[@id="loginForm"]/div/div[1]/div/label/input')

element.send_keys('teaching12311')

element = driver.find_element_by_name('password')

element.send_keys('idemonis123')

element = driver.find_element_by_xpath('//*[@id="loginForm"]/div/div[3]/button').click()
time.sleep(4)
element = driver.find_element_by_xpath('/html/body/div[4]/div/div/div/div[3]/button[2]').click()
time.sleep(2)
driver.get('https://www.instagram.com/direct/inbox/')
time.sleep(6)
names = ['lgbt.50', 'gabe.ews', 'jakob.rundell', 'lucas.jepsen', 'lauringuisart', 'yunyun.cl', 'tengoaburrimiento',
         'constanzamente']
z = 0
for x in names:
    element = driver.find_element_by_xpath(
        '//*[@id="react-root"]/section/div/div[2]/div/div/div[1]/div[1]/div/div[3]/button').click()
    time.sleep(2)
    element = driver.find_element_by_xpath('/html/body/div[5]/div/div/div[2]/div[1]/div/div[2]/input').send_keys(
        names[z])
    time.sleep(2)
    element = driver.find_element_by_xpath('/html/body/div[5]/div/div/div[2]/div[2]/div[1]/div/div[3]/button').click()
    time.sleep(2)
    element = driver.find_element_by_xpath('/html/body/div[5]/div/div/div[1]/div/div[2]/div/button').click()
    time.sleep(2)
    element = driver.find_element_by_xpath('//*[@id="react-root"]/section/div/div[2]/div/div/div[2]/div[2]/div/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div')
    hover = ActionChains(driver).move_to_element(element)
    hover.perform()
    time.sleep(2)
    element = driver.find_element_by_xpath('//*[@id="react-root"]/section/div/div[2]/div/div/div[2]/div[2]/div/div[1]/div/div/div[2]/div[2]/div/div/div/button').click()
    time.sleep(2)
    element = driver.find_element_by_xpath('//*[@id="react-root"]/section/div/div[2]/div/div/div[2]/div[2]/div/div[1]/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div[3]/button').click()
    time.sleep(2)
    element = driver.find_element_by_xpath('/html/body/div[5]/div/div/div/div[2]/button[1]').click()
    time.sleep(2)
    element = driver.find_element_by_xpath(
        '//*[@id="react-root"]/section/div/div[2]/div/div/div[2]/div[2]/div/div[2]/div/div/div[2]/textarea').send_keys(
        'run it up')
    time.sleep(2)
    element = driver.find_element_by_xpath(
        '//*[@id="react-root"]/section/div/div[2]/div/div/div[2]/div[2]/div/div[2]/div/div/div[3]/button').click()

    z += 1

driver.close()