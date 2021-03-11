# Python program to read
# file word by word

# opening the text file
import gspread
import csv
import xlsxwriter
#from oauth2client.service_account import ServiceAccountCredentials
import time

# Create a workbook and add a worksheet.
workbook = xlsxwriter.Workbook('igphotonames.xlsx')
worksheet1 = workbook.add_worksheet('Sheet 1')
"""
scope = ['https://spreadsheets.google.com/feeds', 'https://www.googleapis.com/auth/drive']
creds = ServiceAccountCredentials.from_json_keyfile_name('igphotoScraper.json', scope)
client = gspread.authorize(creds)

sheet = client.open('igphotoScraper').sheet1

numbers = sheet.get_all_records()
"""
contextLines = []
igNames = []
igFollowers = []
igPosts = []
igFollowing = []
name = []
count = 0
with open('finished.txt', 'r') as file:
    # reading each line
    for line in file:

        # reading each word
        for word in line.split():
            # displaying the words
            contextLines.append(word)
for x in contextLines:
    count += 1
    if (x == "AM") or (x == "PM"):
        igNames.append(contextLines[count])
    if (x == "Followers"):
        igFollowers.append(contextLines[count - 2])
    if (x == "Posts"):
        igPosts.append(contextLines[count - 2])
    if (x == "Following"):
        igFollowing.append(contextLines[count - 2])
    if (x == "Following"):
        name.append(contextLines[count])

igLinks = []
count2 = 0
for x in igNames:
    Link = "https://www.instagram.com/" + x + "/?hl=en"
    igLinks.append(Link)
    count += 1

count3 = -1
count4 = 2
fin = []
"""
for x in igNames:
    temp = [igNames[count3], igLinks[count3], igFollowers[count3]]
    sheet.insert_row(temp, count4)
    fin.append(temp)
    time.sleep(3)
    count3+=1
    count4+=1
"""
for x in igNames:
    worksheet1.write(igNames[count3], igLinks[count3], igFollowers[count3])
    fin.append(temp)
    time.sleep(.1)
    count3 += 1
    count4 += 1
    workbook.close()
# fields = ['insta @', 'link', 'followers']
# with open('new.csv', 'w') as f:

#  using csv.writer method from CSV package
# write = csv.writer(f)

#  write.writerow(fields)
#   write.writerows(temp)
#   f.close
print("Done")

