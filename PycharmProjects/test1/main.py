from selenium import webdriver
driver = webdriver.Chrome("/usr/local/bin/chromedriver")
import time
x = input('what hashtag')
z = '#'+x
driver.get('https://instagram.com')
time.sleep(4)
element = driver.find_element_by_xpath('//*[@id="loginForm"]/div/div[1]/div/label/input')

element.send_keys('teaching12311')

element = driver.find_element_by_name('password')

element.send_keys('idemonis123')

element = driver.find_element_by_xpath('//*[@id="loginForm"]/div/div[3]/button').click()
time.sleep(4)
element = driver.find_element_by_xpath('/html/body/div[4]/div/div/div/div[3]/button[2]').click()

#element = driver.find_element_by_xpath('//*[@id="react-root"]/section/nav/div[2]/div/div/div[2]/input').click()
element = driver.find_element_by_xpath('//*[@id="react-root"]/section/nav/div[2]/div/div/div[2]/input').send_keys(z)
time.sleep(2)
element = driver.find_element_by_xpath('//*[@id="react-root"]/section/nav/div[2]/div/div/div[2]/div[4]/div/a[1]/div').click()
time.sleep(3)
row = 1
collumn =1
x = 0
while x<15:

    q = '//*[@id="react-root"]/section/main/article/div[2]/div/div[{}]/div[{}]/a/div/div[2]'.format(row, collumn)
    element = driver.find_element_by_xpath(q).click()
    time.sleep(3)
    element = driver.find_element_by_xpath('/html/body/div[5]/div[2]/div/article/header/div[2]/div[1]/div[2]/button').click()
    time.sleep(3)
    element = driver.find_element_by_xpath('/html/body/div[5]/div[3]/button').click()
    time.sleep(3)
    x+=1
    collumn+=1
    if collumn > 3:
        collumn = 1
        row +=1


