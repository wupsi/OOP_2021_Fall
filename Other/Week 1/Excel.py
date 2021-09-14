import openpyxl
import re

wb = openpyxl.reader.excel.load_workbook('example.xlsx')
wb.active = 0
sheet = wb.active

attend = {}
for i in range(2, int(input('Enter number of rows: ')) + 1):
    Student = sheet['A' + str(i)].value
    action = sheet['B' + str(i)].value
    timestamp = re.findall(r'\d+:\d+:\d{2}', sheet['C' + str(i)].value)[0]
    h = int(re.findall(r'(\d+):\d+:\d{2}', timestamp)[0])
    min = int(re.findall(r'\d+:(\d+):\d{2}', timestamp)[0])
    sec = int(re.findall(r'\d+:\d+:(\d{2})', timestamp)[0])
    time = h * 3600 + min * 60 + sec

    if Student not in attend.keys():
        attend[Student] = time
    elif action == 'Joined':
        attend[Student] += time
    elif action == 'Left':
        attend[Student] -= time

print('\n'.join([f'{student}: {abs(time) // 3600}:{abs(time) // 60 % 60}:{abs(time) % 60}' for student, time in attend.items()]))